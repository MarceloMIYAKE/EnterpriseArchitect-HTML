public class HTMLReport {
	
	// .eap filename or SQL database connection string 
	// File -> Open Project -> right button in the project -> Edit connection string
	private static final String CONNECTION_STRING = "MYPROJECT --- DBType=3;Connect=Provider=OraOLEDB.Oracle.1;Password=mypassword;Persist Security Info=True;User ID=myuser;Data Source=mydatasource;LazyLoad=1;";
	
	// the GUID (in XML format) of the Package or master document to run the report on
	// Project Browser -> right button in the project -> Copy Reference -> Copy Node GUID to Clipboard
	private static final String PACKAGE_GUID = "{12345678-1234-1234-1234-1234567890AB}";

	// the directory path to store the generated report files
	private static final String EXPORT_PATH = "C:\\Apache24\\htdocs\\";
	
	// file format in which to store images - .png or .gif
	private static final String IMAGE_FORMAT = "PNG";
	
	// name of the web style template to apply; use <default> for the standard, system-provided template
	private static final String STYLE = "<default>";
	
	// file extension for generated HTML files (example: .htm)
	private static final String HTML_FILE_EXTENSION = ".html";

	public static void main(String[] args) {
		org.sparx.Repository repository = new org.sparx.Repository();
		repository.OpenFile(CONNECTION_STRING);
		repository.GetProjectInterface().RunHTMLReport(PACKAGE_GUID, EXPORT_PATH, IMAGE_FORMAT, STYLE, HTML_FILE_EXTENSION);
		repository.CloseFile();
		repository.Exit();
	}

}
