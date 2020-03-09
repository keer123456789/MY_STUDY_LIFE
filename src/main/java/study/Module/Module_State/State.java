package study.Module.Module_State;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: study.Module.Module_State
 * @Author: keer
 * @CreateTime: 2020-03-09 14:29
 * @Description: 状态接口
 */
public interface State {
    /**
     * 投入25美分
     */
    void insertQuarter();

    /**
     * 退回25美分
     */
    void ejectQuarter();

    /**
     * 转动曲柄
     */
    void turnCrank();

    /**
     * 分配糖果
     */
    void dispense();

    /**
     * 重新添加糖果
     */
    void refill();
}
