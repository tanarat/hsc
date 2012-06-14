package org.compiere.apps.search;

import java.awt.Frame;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;

import org.compiere.apps.ADialog;
import org.compiere.minigrid.IDColumn;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Msg;

public class InfoEvalItemReason extends Info {
	private static Info_Column[] columns = {new Info_Column("", "HSC_Eval_Item_Reason.HSC_Eval_Item_Reason_ID", IDColumn.class),
												new Info_Column("Name", "HSC_Eval_Item_Reason.Name", String.class)};
	private static String itemReasonFROM = "HSC_Eval_Item_Reason";
	
	protected InfoEvalItemReason(Frame frame, boolean modal, int WindowNo, String value,
			String tableName, String keyColumn,
			boolean multiSelection, String whereClause) {
		super(frame, modal, WindowNo, tableName, keyColumn, multiSelection, whereClause);
		// TODO Auto-generated constructor stub
		log.info(tableName + " - " + keyColumn + " - " + whereClause);
		setTitle(Msg.getMsg(Env.getCtx(), "Info"));
		//
		initInfo(value, whereClause);
		
		//
		int no = p_table.getRowCount();
		setStatusLine(Integer.toString(no) + " " 
			+ Msg.getMsg(Env.getCtx(), "SearchRows_EnterQuery"), false);
		setStatusDB(Integer.toString(no));

		if (value != null && value.length() > 0)
			executeQuery();
	}

	private boolean initInfo(String value, String whereClause) {
		// TODO Auto-generated method stub
		
		//  prepare table
		Properties prop = Env.getCtx();
//		return "HSC_Eval_Item_ID = "+ prop.getProperty("2|1|HSC_Eval_Item_ID");
		StringBuffer where = new StringBuffer();
		where.append("HSC_Eval_Item_ID = "+ Env.getCtx().getProperty("2|1|HSC_Eval_Item_ID"));
		
		prepareTable(columns, itemReasonFROM, where.toString(), "HSC_Eval_Item_Reason.Value");
		return true;
	}
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	

	@Override
	protected void setParameters(PreparedStatement pstmt, boolean forCount)
			throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	protected String getSQLWhere() {
		// TODO Auto-generated method stub
		return "";
	}

}
