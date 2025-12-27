package net.perfect.tea.justalowlatency

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import org.bukkit.plugin.java.JavaPlugin;
import net.perfect.tea.justalowlatency.plugin;

public final class JustALowLatency extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("plugin ligado com sucesso!");
        Bukkit.getConsoleSender().sendMessage("Plugin  iniciado!");
        // Plugin startup logic

    }

    @Override
    public void onLoad() {
        getLogger().info("Carregando ...");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Plugin Desativado com Sucesso!")
            Bukkit.getConsoleSender().sendMessage("O Plugin foi desativado!")
    }
}

public class SimulateLatency {
    latency = int(Bukkit)getPlayer().send("Sua latência é {latency}");
    getLogger().info("{player} calculou a latência usando o JustALowLatency!")
    }

public class VerifyLatency {
    try {
    long ping = LowLatencyCalculator.calcularPing(address, port);
        System.out.println("A latência do servidor " + endereco + ":" + porta + " é de " + ping + "ms.");
 }  catch (Exception e) {
            System.err.println("Erro ao calcular a latência: " + e.getMessage());
            getPlayer().getMessage("Erro ao Calcular a Latência usando o JustALowLatencyCalculator - PerfectTea")
}          
public class LatencyFinal {
    latency.boolean(Bukkit).getPlayer().send("A Latência calculada é: {latency}")