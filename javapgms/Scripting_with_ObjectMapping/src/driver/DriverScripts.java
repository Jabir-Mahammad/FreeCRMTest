package driver;

import java.lang.reflect.Method;

import methods.AppDependentMethods;
import methods.AppIndependentmethods;

public class DriverScripts {

        public static AppIndependentmethods appInd = null;
		public static AppDependentMethods appDep = null;
		public static String strFile = null;
		public static void main(String[] args) {
			Class cls =null;
			Object obj = null;
			Method  M  = null;

			try
			{
				appInd = new AppIndependentmethods();
				appDep = new AppDependentMethods();
			
			strFile = "C:\\Users\\Lenovo\\Desktop\\javapgms\\Scripting_with_ObjectMapping\\Controls\\DataType.xlsx";	
			int rows = appInd.getRowCount(strFile, "TestScript");
			for(int i=0;i<rows-1;i++)
			{
				String strScript = appInd.getCellData(strFile, "TestScript", "ScriptName", i+1);
				String strsClsName = appInd.getCellData(strFile, "TestScript", "ClassName", i+1);
				String strExecute = appInd.getCellData(strFile, "TestScript", "Execute", i+1);
				
				if(strExecute.equalsIgnoreCase("Yes"))
				{
					cls = Class.forName(strsClsName);
					obj = cls.newInstance();
					M = obj.getClass().getMethod(strScript);
					String sResult = String.valueOf(M.invoke(obj));
					
					if(sResult.equals("true"))
					{
						System.out.println("TestCase '"+strScript+"' Passed");
					}else
					{
						System.out.println("TestCase '"+strScript+"' Failed");
						
					}
				}
			}
			
			}catch(Exception e)
			{
				System.out.println(e);
			}
			finally
			{
				appInd = null;
				appDep = null;
			}
	}

}
