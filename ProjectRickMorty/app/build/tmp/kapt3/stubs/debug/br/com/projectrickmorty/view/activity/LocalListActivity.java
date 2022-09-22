package br.com.projectrickmorty.view.activity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import br.com.projectrickmorty.R;
import br.com.projectrickmorty.view.SharedViewModel;
import br.com.projectrickmorty.view.recycler.adapter.LocalListAdapter;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0012\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0006\u0010\u0017\u001a\u00020\u000eR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lbr/com/projectrickmorty/view/activity/LocalListActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lbr/com/projectrickmorty/view/recycler/adapter/LocalListAdapter;", "getAdapter", "()Lbr/com/projectrickmorty/view/recycler/adapter/LocalListAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "pagina", "", "viewModel", "Lbr/com/projectrickmorty/view/SharedViewModel;", "defineListenerBotoes", "", "botaoProximaPagina", "Landroid/widget/ImageButton;", "botaoPaginaAnterior", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSupportNavigateUp", "", "setupRecyclerView", "app_debug"})
public final class LocalListActivity extends androidx.appcompat.app.AppCompatActivity {
    private int pagina = 1;
    private final br.com.projectrickmorty.view.SharedViewModel viewModel = null;
    private final kotlin.Lazy adapter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public LocalListActivity() {
        super();
    }
    
    private final br.com.projectrickmorty.view.recycler.adapter.LocalListAdapter getAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void defineListenerBotoes(android.widget.ImageButton botaoProximaPagina, android.widget.ImageButton botaoPaginaAnterior) {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    public final void setupRecyclerView() {
    }
}