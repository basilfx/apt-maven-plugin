/*
 * Copyright (c) 2009 Mysema Ltd.
 * All rights reserved.
 * 
 */
package com.mysema.maven.apt;

import java.io.File;

/**
 * AnnotationProcessorMojo calls APT processors for code generation
 * 
 * @goal process
 * @phase generate-sources
 * @requiresDependencyResolution compile
 * @threadSafe true
 */
public class AnnotationProcessorMojo extends AbstractProcessorMojo {

    /**
     * @parameter
     */
    private File outputDirectory;

    /**
     * The location of the flag file used to determine if the output is stale.
     *
     * @parameter default-value="${project.build.directory}//.aptStaleFlag"
     * @required
     */
    private File staleFile;

    @Override
    public File getOutputDirectory() {
        return outputDirectory;
    }

    public void setOutputDirectory(File outputDirectory) {
        this.outputDirectory = outputDirectory;
    }

    @Override
    public File getStaleFile() {
        return staleFile;
    }

    public void setStaleFile(File staleFile) {
        this.staleFile = staleFile;
    }
}
