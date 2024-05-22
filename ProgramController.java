// Controller
public class ProgramController{
    ProgramModel model;
    ProgramView view;

    public ProgramController(ProgramModel model, ProgramView view){
        this.model = model;
        this.view = view;
    }

    public void updateModel(){
        // database call (JDBC Technology)
        String[] program = {"BICT", "BCA", "BBS", "BSW", "BBA"};
       // view.setView(program);
        model.setProgram(program);
    }

    public void updateView(){
        view.setView(model.getProgram());
    }

    public static void main(String[] args)
    {
        ProgramModel model = new ProgramModel();
        ProgramView view = new ProgramView();
        ProgramController controller new ProgramController(model, view);
        controller.updateModel();
        controller.updateView();
        
       
    }

}