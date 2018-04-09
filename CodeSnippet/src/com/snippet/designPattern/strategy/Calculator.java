package com.snippet.designPattern.strategy;

/**
 * 策略枚举
 *
 * 对于不需要经常变化的策略，简直完美
 */
public enum Calculator
{
    ADD("+")
        {
            public int exec(int a, int b)
            {
                return a + b;
            }
        },
    SUB("-")
        {
            public int exec(int a, int b)
            {
                return a - b;
            }
        };

    public abstract int exec(int a, int b);

    // 或许根本不需要以下的代码 ====
    private String value = "";

    private Calculator(String value)
    {
        this.value = value;
    }

    public String getValue()
    {
        return value;
    }
}
