package com.testng_concepts;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Annotation_Transformer implements IAnnotationTransformer{
@Override
public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
annotation.setRetryAnalyzer(Rerun_Launch.class);
}
}
