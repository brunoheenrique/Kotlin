package br.com.projectrickmorty.controller.retrofit;

import br.com.projectrickmorty.controller.retrofit.api.CharApiClient;
import br.com.projectrickmorty.controller.retrofit.api.EpApiClient;
import br.com.projectrickmorty.controller.retrofit.api.LocalApiClient;
import br.com.projectrickmorty.controller.retrofit.services.CharacterService;
import br.com.projectrickmorty.controller.retrofit.services.EpisodeService;
import br.com.projectrickmorty.controller.retrofit.services.LocationService;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\b\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\b\u001a\u0004\b\u001a\u0010\u0017R\u001b\u0010\u001c\u001a\u00020\u001d8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010\b\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010!\u001a\u00020\"\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001b\u0010%\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\'\u0010\b\u001a\u0004\b&\u0010\u001fR\u000e\u0010(\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lbr/com/projectrickmorty/controller/retrofit/NetworkUtils;", "", "()V", "charApi", "Lbr/com/projectrickmorty/controller/retrofit/services/CharacterService;", "getCharApi", "()Lbr/com/projectrickmorty/controller/retrofit/services/CharacterService;", "charApi$delegate", "Lkotlin/Lazy;", "charApiClient", "Lbr/com/projectrickmorty/controller/retrofit/api/CharApiClient;", "getCharApiClient", "()Lbr/com/projectrickmorty/controller/retrofit/api/CharApiClient;", "charService", "getCharService", "charService$delegate", "epApiClient", "Lbr/com/projectrickmorty/controller/retrofit/api/EpApiClient;", "getEpApiClient", "()Lbr/com/projectrickmorty/controller/retrofit/api/EpApiClient;", "epiApi", "Lbr/com/projectrickmorty/controller/retrofit/services/EpisodeService;", "getEpiApi", "()Lbr/com/projectrickmorty/controller/retrofit/services/EpisodeService;", "epiApi$delegate", "episodeService", "getEpisodeService", "episodeService$delegate", "localApi", "Lbr/com/projectrickmorty/controller/retrofit/services/LocationService;", "getLocalApi", "()Lbr/com/projectrickmorty/controller/retrofit/services/LocationService;", "localApi$delegate", "localApiClient", "Lbr/com/projectrickmorty/controller/retrofit/api/LocalApiClient;", "getLocalApiClient", "()Lbr/com/projectrickmorty/controller/retrofit/api/LocalApiClient;", "locationService", "getLocationService", "locationService$delegate", "retrofit", "Lretrofit2/Retrofit;", "app_debug"})
public final class NetworkUtils {
    @org.jetbrains.annotations.NotNull()
    public static final br.com.projectrickmorty.controller.retrofit.NetworkUtils INSTANCE = null;
    private static final retrofit2.Retrofit retrofit = null;
    private static final kotlin.Lazy charService$delegate = null;
    private static final kotlin.Lazy episodeService$delegate = null;
    private static final kotlin.Lazy locationService$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final br.com.projectrickmorty.controller.retrofit.api.CharApiClient charApiClient = null;
    @org.jetbrains.annotations.NotNull()
    private static final br.com.projectrickmorty.controller.retrofit.api.EpApiClient epApiClient = null;
    @org.jetbrains.annotations.NotNull()
    private static final br.com.projectrickmorty.controller.retrofit.api.LocalApiClient localApiClient = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy charApi$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy epiApi$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy localApi$delegate = null;
    
    private NetworkUtils() {
        super();
    }
    
    private final br.com.projectrickmorty.controller.retrofit.services.CharacterService getCharService() {
        return null;
    }
    
    private final br.com.projectrickmorty.controller.retrofit.services.EpisodeService getEpisodeService() {
        return null;
    }
    
    private final br.com.projectrickmorty.controller.retrofit.services.LocationService getLocationService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.projectrickmorty.controller.retrofit.api.CharApiClient getCharApiClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.projectrickmorty.controller.retrofit.api.EpApiClient getEpApiClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.projectrickmorty.controller.retrofit.api.LocalApiClient getLocalApiClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.projectrickmorty.controller.retrofit.services.CharacterService getCharApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.projectrickmorty.controller.retrofit.services.EpisodeService getEpiApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.projectrickmorty.controller.retrofit.services.LocationService getLocalApi() {
        return null;
    }
}