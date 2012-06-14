//package org.hsc.process;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.math.BigDecimal;
//
//import javax.swing.JFileChooser;
//
//
//import org.compiere.process.ProcessInfoParameter;
//import org.compiere.process.SvrProcess;
//import org.hsc.model.MHSCHalqProject;
//
//import word.api.interfaces.IDocument;
//import word.w2004.Document2004;
//import word.w2004.elements.Heading1;
//
//public class CreateAnnualReport extends SvrProcess{
//	private ProcessInfoParameter[] paras;
//	@Override
//	protected void prepare() {
//		// TODO Auto-generated method stub
//		paras = getParameter();
//		
//	}
//
//	@Override
//	protected String doIt() throws Exception {
//		// TODO Auto-generated method stub
//		Integer projectID = ((BigDecimal) paras[0].getParameter()).intValue();
//		
//		System.out.println(projectID);
//		
//		MHSCHalqProject project = new MHSCHalqProject(getCtx(), projectID, get_TrxName());
//		
//		
//		
//		IDocument myDoc = new Document2004();
//		myDoc.addEle(Heading1.with(project.getName()+"").create());
//
//        String myWord = myDoc.getContent();
//        final JFileChooser fc = new JFileChooser();
//        int returnVal = fc.showSaveDialog(null);
//        File fileObj = null;
//		if (returnVal == JFileChooser.APPROVE_OPTION) {
//			fileObj = new File(fc.getSelectedFile().getAbsolutePath());
//		}
//        
//
//        PrintWriter writer = null;
//        try {
//        	if(fileObj == null){
//        		return "Process cancelled";
//        	}
//            writer = new PrintWriter(fileObj);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        
//
//        writer.println(myWord);
//        writer.close();
//		return "Success";
//	}
//
//}
