package com.juin;

import java.lang.instrument.Instrumentation;

/**
 * @author huoyun
 * @date 2021/7/13 7:56 下午
 * @company: www.dtstack.com
 */
public class TestAgent {

    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println("this is a java agent with two args");
        System.out.println("参数:" + agentArgs + "\n");
    }

    public static void premain(String agentArgs) {
        System.out.println("this is a java agent only one args");
        System.out.println("参数:" + agentArgs + "\n");
    }
}
