package br.com.projectrickmorty.controller.retrofit.api;

import retrofit2.Response;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u0000 #*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002#$B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0019\u001a\u00020\u0004H\u00c6\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006H\u00c6\u0003J\u0011\u0010\u001b\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH\u00c6\u0003J=\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\"H\u00d6\u0001R\u0011\u0010\u000b\u001a\u00028\u00008F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006%"}, d2 = {"Lbr/com/projectrickmorty/controller/retrofit/api/SimpleResponse;", "T", "", "status", "Lbr/com/projectrickmorty/controller/retrofit/api/SimpleResponse$Status;", "data", "Lretrofit2/Response;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Lbr/com/projectrickmorty/controller/retrofit/api/SimpleResponse$Status;Lretrofit2/Response;Ljava/lang/Exception;)V", "body", "getBody", "()Ljava/lang/Object;", "getData", "()Lretrofit2/Response;", "getException", "()Ljava/lang/Exception;", "failed", "", "getFailed", "()Z", "isSuccessful", "getStatus", "()Lbr/com/projectrickmorty/controller/retrofit/api/SimpleResponse$Status;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "Status", "app_debug"})
public final class SimpleResponse<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final br.com.projectrickmorty.controller.retrofit.api.SimpleResponse.Status status = null;
    @org.jetbrains.annotations.Nullable()
    private final retrofit2.Response<T> data = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Exception exception = null;
    @org.jetbrains.annotations.NotNull()
    public static final br.com.projectrickmorty.controller.retrofit.api.SimpleResponse.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.projectrickmorty.controller.retrofit.api.SimpleResponse<T> copy(@org.jetbrains.annotations.NotNull()
    br.com.projectrickmorty.controller.retrofit.api.SimpleResponse.Status status, @org.jetbrains.annotations.Nullable()
    retrofit2.Response<T> data, @org.jetbrains.annotations.Nullable()
    java.lang.Exception exception) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public SimpleResponse(@org.jetbrains.annotations.NotNull()
    br.com.projectrickmorty.controller.retrofit.api.SimpleResponse.Status status, @org.jetbrains.annotations.Nullable()
    retrofit2.Response<T> data, @org.jetbrains.annotations.Nullable()
    java.lang.Exception exception) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.projectrickmorty.controller.retrofit.api.SimpleResponse.Status component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.projectrickmorty.controller.retrofit.api.SimpleResponse.Status getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final retrofit2.Response<T> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final retrofit2.Response<T> getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Exception component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Exception getException() {
        return null;
    }
    
    public final boolean getFailed() {
        return false;
    }
    
    public final boolean isSuccessful() {
        return false;
    }
    
    public final T getBody() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lbr/com/projectrickmorty/controller/retrofit/api/SimpleResponse$Status;", "", "()V", "Failure", "Success", "Lbr/com/projectrickmorty/controller/retrofit/api/SimpleResponse$Status$Failure;", "Lbr/com/projectrickmorty/controller/retrofit/api/SimpleResponse$Status$Success;", "app_debug"})
    public static abstract class Status {
        
        private Status() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lbr/com/projectrickmorty/controller/retrofit/api/SimpleResponse$Status$Success;", "Lbr/com/projectrickmorty/controller/retrofit/api/SimpleResponse$Status;", "()V", "app_debug"})
        public static final class Success extends br.com.projectrickmorty.controller.retrofit.api.SimpleResponse.Status {
            @org.jetbrains.annotations.NotNull()
            public static final br.com.projectrickmorty.controller.retrofit.api.SimpleResponse.Status.Success INSTANCE = null;
            
            private Success() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lbr/com/projectrickmorty/controller/retrofit/api/SimpleResponse$Status$Failure;", "Lbr/com/projectrickmorty/controller/retrofit/api/SimpleResponse$Status;", "()V", "app_debug"})
        public static final class Failure extends br.com.projectrickmorty.controller.retrofit.api.SimpleResponse.Status {
            @org.jetbrains.annotations.NotNull()
            public static final br.com.projectrickmorty.controller.retrofit.api.SimpleResponse.Status.Failure INSTANCE = null;
            
            private Failure() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bJ \u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00050\u000b\u00a8\u0006\f"}, d2 = {"Lbr/com/projectrickmorty/controller/retrofit/api/SimpleResponse$Companion;", "", "()V", "failure", "Lbr/com/projectrickmorty/controller/retrofit/api/SimpleResponse;", "T", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "success", "data", "Lretrofit2/Response;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>br.com.projectrickmorty.controller.retrofit.api.SimpleResponse<T> success(@org.jetbrains.annotations.NotNull()
        retrofit2.Response<T> data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>br.com.projectrickmorty.controller.retrofit.api.SimpleResponse<T> failure(@org.jetbrains.annotations.NotNull()
        java.lang.Exception exception) {
            return null;
        }
    }
}