package com.yanfei.scaffolding.privilege.response;

import lombok.Data;

/**
 * Created by : yanfei
 * Created time : 18/6/21 下午1:53
 */
@Data
public class Page<T> {

    /**
     * 分页起始页
     */
    private int index = 1;

    /**
     * 分页每页条数
     */
    private int size = PAGINATION_DEFAULT_SIZE;

    /**
     * 数据库分页查询偏移量
     */
    private int offset;

    /**
     * 总共记录
     */
    private int count;

    private T result;

    /**
     * 分页每页最大条数
     */
    public static final int PAGINATION_MAX_SIZE = 100000;

    public static final int PAGINATION_DEFAULT_SIZE = 10;

    public Page() {

    }

    public Page(int index, int size) {
        this.index = index;
        this.size = size;
    }

    /**
     * 获得总页数
     *
     * @param size
     *            每页多少条
     * @param count
     *            总共记录
     * @return
     */
    public static int getTotalPage(int size, int count) {
        int m = count % size;
        if (m > 0) {
            return count / size + 1;
        } else {
            return count / size;
        }
    }

    public int getOffset() {
        offset = (this.index - 1) * this.size;
        return offset;
    }

    public void setSize(int size) {
        // 控制一页不能超过分页每页最大条数
        if (size > PAGINATION_MAX_SIZE) {
            size = PAGINATION_MAX_SIZE;
        }
        this.size = size;
    }


}
