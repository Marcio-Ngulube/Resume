package com.example.ceevee.view;

import com.openpojo.reflection.impl.PojoClassFactory;
import com.openpojo.validation.Validator;
import com.openpojo.validation.ValidatorBuilder;
import com.openpojo.validation.rule.impl.GetterMustExistRule;
import com.openpojo.validation.rule.impl.SetterMustExistRule;
import com.openpojo.validation.test.impl.GetterTester;
import com.openpojo.validation.test.impl.SetterTester;

public class PojoTestUtils {

    private static final Validator ACESSOR_VALIDATOR= ValidatorBuilder.create()
            .with(new GetterMustExistRule())
            .with(new SetterMustExistRule())
            .with(new GetterTester())
            .with(new SetterTester())
            .build();

    public static void validateAccessors(final Class<?> classes){
        ACESSOR_VALIDATOR.validate(PojoClassFactory.getPojoClass(classes));
    }

}
