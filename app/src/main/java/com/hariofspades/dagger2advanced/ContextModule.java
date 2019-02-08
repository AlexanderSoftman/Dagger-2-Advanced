package com.hariofspades.dagger2advanced;

import android.content.Context;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {
    Context context;

    public ContextModule(Context context) {
        this.context = context;
    }

    @Named("application_context")
    @RandomUserApplicationScope
    @Provides
    public Context context() {
        return context.getApplicationContext();
    }
}
