package com.snippet.designPattern.builder;

import java.util.ArrayList;

/**
 * 建造者模式的导演类
 * 创建型
 *
 * 暂不考虑并发场景
 */
public class Director
{
    // TODO 并发修改
    private ArrayList<String> sequence = new ArrayList<String>();

    private BenzBuilder benzBuilder = new BenzBuilder();

    private PaganiBuilder paganiBuilder = new PaganiBuilder();

    /**
     * 生产一个benz类，方法执行顺序为：start、stop、alarm
     */
    public BenzModel getABenzModel()
    {
        this.sequence.clear();

        this.sequence.add("start");
        this.sequence.add("stop");
        this.sequence.add("alarm");

        this.benzBuilder.setSequence(this.sequence);

        return (BenzModel)this.benzBuilder.getCarModel();
    }

    /**
     * 生产一个pagani类，方法执行顺序为：stop、start、alarm
     */
    public PaganiModel getAPaganiModel()
    {
        this.sequence.clear();

        this.sequence.add("stop");
        this.sequence.add("start");
        this.sequence.add("alarm");

        this.paganiBuilder.setSequence(this.sequence);

        return (PaganiModel)this.paganiBuilder.getCarModel();
    }
}
