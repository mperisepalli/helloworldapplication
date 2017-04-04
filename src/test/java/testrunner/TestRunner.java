package testrunner;

import org.junit.runner.JUnitCore;

import testsuite.JunitTestSuite;

public class TestRunner {
    public static void main(String[] args) {
        JUnitCore.runClasses(JunitTestSuite.class);
    }
}