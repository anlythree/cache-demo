package focusmode;

/**
 * 集中式的缓存实现方案
 */
public class MyCacheByFocusMode {

    /**
     * 向缓存中保存数据
     * @param key
     * @param value
     */
    public void put(Object key,Object value){
        // 保存数据
    }


    /**
     * 根据key取值
     * @param key
     * @return
     */
    public Object get(Object key){
        // 取值
        return new Object();
    }

    /**
     * 清空缓存
     */
    public void clean(){

    }

    /**
     * 获取缓存个数
     */
    public void size(){

    }

    /**
     * 溢出淘汰
     */
    private void overFlow(){

    }

    /**
     * 清理过期数据
     */
    private void overTime(){

    }
}
