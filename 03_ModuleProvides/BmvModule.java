package com.mahdi.dagger;

import com.mahdi.dagger.limbs.Bmv;
import com.mahdi.dagger.limbs.Branch1;
import com.mahdi.dagger.limbs.Branch2;
import dagger.Module;
import dagger.Provides;

@Module
public class BmvModule {

    @Provides
    Branch1 getBranch1() {
        return new Branch1();
    }


    @Provides
    Branch2 getBranch2() {
        return new Branch2();
    }


    @Provides
    Bmv getBmv(Branch1 branch1, Branch2 branch2) {
        return new Bmv(branch1, branch2);
    }

}
