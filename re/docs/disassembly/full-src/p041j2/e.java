package p041j2;

import Q1.d;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f11575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f11576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f11577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f11578d;
    public static final d[] e;

    static {
        d dVar = new d("auth_api_credentials_begin_sign_in", 9L);
        d dVar2 = new d("auth_api_credentials_sign_out", 2L);
        f11575a = dVar2;
        d dVar3 = new d("auth_api_credentials_authorize", 1L);
        d dVar4 = new d("auth_api_credentials_revoke_access", 1L);
        d dVar5 = new d("auth_api_credentials_save_password", 4L);
        f11576b = dVar5;
        d dVar6 = new d("auth_api_credentials_get_sign_in_intent", 6L);
        f11577c = dVar6;
        d dVar7 = new d("auth_api_credentials_save_account_linking_token", 3L);
        d dVar8 = new d("auth_api_credentials_get_phone_number_hint_intent", 3L);
        f11578d = dVar8;
        e = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8};
    }
}
