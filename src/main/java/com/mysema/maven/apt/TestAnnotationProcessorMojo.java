/*
 * Copyright (c) 2009 Mysema Ltd.
 * All rights reserved.
 * 
 */
package com.mysema.maven.apt;

import java.io.File;

/**
 * TestAnnotationProcessorMojo calls APT processors for code generation
 * 
 * @goal test-process
 * @phase generate-test-sources
 * @requiresDependencyResolution test
 * @threadSafe true
 */
public class TestAnnotationProcessorMojo extends AbstractProcessorMojo {

    /**
     * @parameter
     */
    private File outputDirectory;

    /**
     * @parameter
     */
    private File testOutputDirectory;

    /**
     * The location of the flag file used to determine if the output is stale.
     *
     * @parameter default-value="${project.build.directory}//.aptStaleFlag"
     * @required
     */
    private File staleFile;

    @Override
    public File getOutputDirectory() {
        return testOutputDirectory != null ? testOutputDirectory : outputDirectory;
    }

    @Override
    public File getStaleFile() {
        return staleFile;
    }

    public void setStaleFile(File staleFile) {
        this.staleFile = staleFile;
    }

    @Override
    protected boolean isForTest(){
        return true;
    }

    public void setOutputDirectory(File outputDirectory) {
        this.outputDirectory = outputDirectory;
    }

    public void setTestOutputDirectory(File testOutputDirectory) {
        this.testOutputDirectory = testOutputDirectory;
    }
    
}
