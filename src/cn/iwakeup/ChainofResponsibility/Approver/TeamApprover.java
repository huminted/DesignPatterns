package cn.iwakeup.ChainofResponsibility.Approver;

import cn.iwakeup.ChainofResponsibility.Request.Request;

/**
 * @Author Humin
 * @Date 2018/10/14 11:05
 */
public class TeamApprover extends AbsApprover {



    @Override
    public void handleRequest(Request mRequest) {

        if (mRequest.getTotal()>5000&&mRequest.getTotal()<=10000) {
            System.out.println("ID:"+mRequest.getId()+" be Done By TeamApprover");
        }else {
            nextApprover.handleRequest(mRequest);
        }
    }

    @Override
    public void setApprover(AbsApprover approver) {
        nextApprover=approver;
    }
}
