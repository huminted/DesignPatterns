package cn.iwakeup.Observer.Subject;

import cn.iwakeup.Observer.Observer.Observer;

/**
 * @Author Humin
 * @Date 2018 09 30 12:35
 */
public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();

}
