package com.bazel_diff;

import picocli.CommandLine.IVersionProvider;

class VersionProvider implements IVersionProvider {
    public String[] getVersion() throws Exception {
        return new String[] {
            "3.2.2"
        };
    }
}
