package br.com.projectrickmorty.controller.retrofit.api;

import br.com.projectrickmorty.controller.retrofit.services.EpisodeService;
import br.com.projectrickmorty.model.EpisodePosts;
import retrofit2.Response;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ)\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\f0\u0006\"\u0004\b\u0000\u0010\f2\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u000f0\u000eH\u0082\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lbr/com/projectrickmorty/controller/retrofit/api/EpApiClient;", "", "rickAndMortyService", "Lbr/com/projectrickmorty/controller/retrofit/services/EpisodeService;", "(Lbr/com/projectrickmorty/controller/retrofit/services/EpisodeService;)V", "getEpisodeById", "Lbr/com/projectrickmorty/controller/retrofit/api/SimpleResponse;", "Lbr/com/projectrickmorty/model/EpisodePosts;", "episodeId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "safeApiCall", "T", "apiCall", "Lkotlin/Function0;", "Lretrofit2/Response;", "app_debug"})
public final class EpApiClient {
    private final br.com.projectrickmorty.controller.retrofit.services.EpisodeService rickAndMortyService = null;
    
    public EpApiClient(@org.jetbrains.annotations.NotNull()
    br.com.projectrickmorty.controller.retrofit.services.EpisodeService rickAndMortyService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getEpisodeById(int episodeId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super br.com.projectrickmorty.controller.retrofit.api.SimpleResponse<br.com.projectrickmorty.model.EpisodePosts>> continuation) {
        return null;
    }
    
    private final <T extends java.lang.Object>br.com.projectrickmorty.controller.retrofit.api.SimpleResponse<T> safeApiCall(kotlin.jvm.functions.Function0<retrofit2.Response<T>> apiCall) {
        return null;
    }
}