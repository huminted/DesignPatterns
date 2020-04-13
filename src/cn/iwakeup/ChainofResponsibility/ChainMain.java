package cn.iwakeup.ChainofResponsibility;

import cn.iwakeup.ChainofResponsibility.Approver.*;
import cn.iwakeup.ChainofResponsibility.Request.Request;

/**
 * @Author Humin
 * @Date 2018/10/14 10:54
 */
public class ChainMain {

    public static void main(String a[]){
        Request mRequest=new Request(1,200,20);
        Request mRequest2=new Request(1,200,30);
        Request mRequest3=new Request(1,200,6000);

        AbsApprover mGroupApprover=new GroupApprover();
        AbsApprover mTeamApprover=new TeamApprover();
        AbsApprover mVicePresidentApprover=new VicePresidentApprover();
        AbsApprover mPresidentApprover=new PresidentApprover();

        mGroupApprover.setApprover(mTeamApprover);
        mTeamApprover.setApprover(mVicePresidentApprover);
        mVicePresidentApprover.setApprover(mPresidentApprover);
        mPresidentApprover.setApprover(mTeamApprover);


        mGroupApprover.handleRequest(mRequest3);




    }

}
