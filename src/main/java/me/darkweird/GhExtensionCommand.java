package me.darkweird;

import io.micronaut.configuration.picocli.PicocliRunner;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name = "gh-echo", description = "...",
        mixinStandardHelpOptions = true)
public class GhExtensionCommand implements Runnable {

    @Parameters(arity = "1", description = "Echo this")
    String param;

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(GhExtensionCommand.class, args);
    }

    public void run() {
        System.out.println(param);
    }
}
