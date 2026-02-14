# Estágio de Build
FROM eclipse-temurin:21-jdk-jammy AS build
WORKDIR /app

# 1. Instala o Git (necessário para aplicar os patches do Paper)
RUN apt-get update && apt-get install -y git


RUN git config --global user.email "ci@teapaper.br" && \
    git config --global user.name "TeaPaper CI"

# Copia os arquivos do projeto
COPY . .

# Dá permissão de execução ao gradlew
RUN chmod +x gradlew


RUN ./gradlew applyPatches --no-daemon


RUN ./gradlew createReobfPaperclipJar --no-daemon

# Estágio Final (Runtime)
FROM eclipse-temurin:21-jre-jammy
WORKDIR /server


COPY --from=build /app/build/libs/*-paperclip-*.jar server.jar

EXPOSE 25565
CMD ["java", "-Xms2G", "-Xmx2G", "-jar", "server.jar"]
