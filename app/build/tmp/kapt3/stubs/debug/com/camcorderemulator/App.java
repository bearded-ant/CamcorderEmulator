package com.camcorderemulator;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"Lcom/camcorderemulator/App;", "Landroid/app/Application;", "()V", "onCreate", "", "Companion", "app_debug"})
public final class App extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    public static final com.camcorderemulator.App.Companion Companion = null;
    private static com.camcorderemulator.App instance;
    public static com.camcorderemulator.domain.CamcordersBase database;
    
    public App() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/camcorderemulator/App$Companion;", "", "()V", "database", "Lcom/camcorderemulator/domain/CamcordersBase;", "getDatabase", "()Lcom/camcorderemulator/domain/CamcordersBase;", "setDatabase", "(Lcom/camcorderemulator/domain/CamcordersBase;)V", "<set-?>", "Lcom/camcorderemulator/App;", "instance", "getInstance", "()Lcom/camcorderemulator/App;", "setInstance", "(Lcom/camcorderemulator/App;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.camcorderemulator.App getInstance() {
            return null;
        }
        
        private final void setInstance(com.camcorderemulator.App p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.camcorderemulator.domain.CamcordersBase getDatabase() {
            return null;
        }
        
        public final void setDatabase(@org.jetbrains.annotations.NotNull()
        com.camcorderemulator.domain.CamcordersBase p0) {
        }
    }
}