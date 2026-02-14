# Estágio de Build
FROM eclipse-temurin:21-jdk-jammy AS build
WORKDIR /app

# Copia os arquivos do projeto
COPY . .

# Dá permissão de execução ao gradlew
RUN chmod +x gradlew


RUN ./gradlew clean build --no-daemon

# Estágio Final (Runtime)
FROM eclipse-temurin:21-jre-jammy
WORKDIR /server


COPY --from=build /app/build/libs/*.jar server.jar

EXPOSE 25565
CMD ["java", "-Xms2G", "-Xmx2G", "-jar", "server.jar"]
