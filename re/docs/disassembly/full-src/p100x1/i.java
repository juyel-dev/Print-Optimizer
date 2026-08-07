package p100x1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f13704a;

    public i(k kVar) {
        this.f13704a = kVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        k kVar = this.f13704a;
        kVar.setEnabled(true);
        kVar.f13709o.setEnabled(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        k kVar = this.f13704a;
        kVar.setEnabled(true);
        kVar.f13709o.setEnabled(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        k kVar = this.f13704a;
        kVar.setEnabled(false);
        kVar.f13709o.setEnabled(false);
    }
}
