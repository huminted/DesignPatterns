package cn.iwakeup.ChainofResponsibility.Approver;

import cn.iwakeup.ChainofResponsibility.Request.Request;

/**
 * @Author Humin
 * @Date 2018/10/14 10:55
 */
public abstract class AbsApprover {

    Request mRequest;
    AbsApprover nextApprover;



    public abstract void handleRequest(Request  mRequest);

    public void setApprover(AbsApprover approver){
        nextApprover=approver;
    }

}
