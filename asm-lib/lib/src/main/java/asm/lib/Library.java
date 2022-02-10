/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package asm.lib;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Weave
public class Library {
    private String someField;

    public boolean someLibraryMethod() {
        return true;
    }

    public Future<String> calculateAsync() {

        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        Executors.newCachedThreadPool().submit(() -> {

                    Thread.sleep(500);
                    completableFuture.complete("Hello");
                    return null;
                }
        );

        return completableFuture;
    }

}
