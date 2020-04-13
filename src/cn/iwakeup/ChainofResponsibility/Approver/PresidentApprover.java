package cn.iwakeup.ChainofResponsibility.Approver;

import cn.iwakeup.ChainofResponsibility.Request.Request;

/**
 * @Author Humin
 * @Date 2018/10/14 11:28
 */
public class PresidentApprover extends AbsApprover {
    @Override
    public void handleRequest(Request mRequest) {
        if (mRequest.getTotal()>=20000){
            System.out.println("ID:"+mRequest.getId()+"be Done By PresidentApprover");
        }else {
            nextApprover.handleRequest(mRequest);
        }
    }

    @Override
    public void setApprover(AbsApprover approver) {
        nextApprover=approver;
    }
}
