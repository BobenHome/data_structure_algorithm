package segmenttree;

/**
 * @author dongliangliang
 * @date 2023/7/4 21:06:40
 */
public interface Merger<E> {

    E merge(E a, E b);
}
