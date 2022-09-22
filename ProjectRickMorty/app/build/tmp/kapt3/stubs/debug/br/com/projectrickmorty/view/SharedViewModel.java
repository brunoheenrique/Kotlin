package br.com.projectrickmorty.view;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import br.com.projectrickmorty.controller.retrofit.SharedRepository;
import br.com.projectrickmorty.model.CharPosts;
import br.com.projectrickmorty.model.EpisodePosts;
import br.com.projectrickmorty.model.LocationPosts;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001fJ\u000e\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u001fJ\u000e\u0010%\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010&\u001a\u00020\u001d2\u0006\u0010\'\u001a\u00020\u001fR\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00110\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00110\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00110\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0019\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\rR\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lbr/com/projectrickmorty/view/SharedViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_characterByIdLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lbr/com/projectrickmorty/model/CharPosts;", "_episodeByIdLiveData", "Lbr/com/projectrickmorty/model/EpisodePosts;", "_localByIdLiveData", "Lbr/com/projectrickmorty/model/LocationPosts;", "characterByIdLiveData", "Landroidx/lifecycle/LiveData;", "getCharacterByIdLiveData", "()Landroidx/lifecycle/LiveData;", "episodeByIdLiveData", "getEpisodeByIdLiveData", "listCharacterLiveData", "", "getListCharacterLiveData", "()Landroidx/lifecycle/MutableLiveData;", "listEpisodeLiveData", "getListEpisodeLiveData", "listLocalLiveData", "getListLocalLiveData", "localByIdLiveData", "getLocalByIdLiveData", "repository", "Lbr/com/projectrickmorty/controller/retrofit/SharedRepository;", "refreshCharList", "", "page", "", "refreshCharacter", "charId", "refreshEpList", "refreshEpisode", "episodeId", "refreshLocalList", "refreshLocation", "localId", "app_debug"})
public final class SharedViewModel extends androidx.lifecycle.ViewModel {
    private final br.com.projectrickmorty.controller.retrofit.SharedRepository repository = null;
    private final androidx.lifecycle.MutableLiveData<br.com.projectrickmorty.model.CharPosts> _characterByIdLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<br.com.projectrickmorty.model.CharPosts> characterByIdLiveData = null;
    private final androidx.lifecycle.MutableLiveData<br.com.projectrickmorty.model.EpisodePosts> _episodeByIdLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<br.com.projectrickmorty.model.EpisodePosts> episodeByIdLiveData = null;
    private final androidx.lifecycle.MutableLiveData<br.com.projectrickmorty.model.LocationPosts> _localByIdLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<br.com.projectrickmorty.model.LocationPosts> localByIdLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<br.com.projectrickmorty.model.EpisodePosts>> listEpisodeLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<br.com.projectrickmorty.model.CharPosts>> listCharacterLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<br.com.projectrickmorty.model.LocationPosts>> listLocalLiveData = null;
    
    public SharedViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<br.com.projectrickmorty.model.CharPosts> getCharacterByIdLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<br.com.projectrickmorty.model.EpisodePosts> getEpisodeByIdLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<br.com.projectrickmorty.model.LocationPosts> getLocalByIdLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<br.com.projectrickmorty.model.EpisodePosts>> getListEpisodeLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<br.com.projectrickmorty.model.CharPosts>> getListCharacterLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<br.com.projectrickmorty.model.LocationPosts>> getListLocalLiveData() {
        return null;
    }
    
    public final void refreshCharacter(int charId) {
    }
    
    public final void refreshEpisode(int episodeId) {
    }
    
    public final void refreshLocation(int localId) {
    }
    
    public final void refreshCharList(int page) {
    }
    
    public final void refreshEpList(int page) {
    }
    
    public final void refreshLocalList(int page) {
    }
}