package br.com.projectrickmorty.controller.retrofit.services;

import br.com.projectrickmorty.model.CharList;
import br.com.projectrickmorty.model.CharPosts;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\n\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lbr/com/projectrickmorty/controller/retrofit/services/CharacterService;", "", "getCharListPost", "Lretrofit2/Response;", "Lbr/com/projectrickmorty/model/CharList;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCharPost", "Lbr/com/projectrickmorty/model/CharPosts;", "id", "app_debug"})
public abstract interface CharacterService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "character/{id}")
    public abstract java.lang.Object getCharPost(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<br.com.projectrickmorty.model.CharPosts>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "character")
    public abstract java.lang.Object getCharListPost(@retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<br.com.projectrickmorty.model.CharList>> continuation);
}