package customerprofile;

public class ServiceErrorResponse
{
  private int serviceErrorCode = 500;
  private boolean validationProblem = false;
  private String message = "Unknown server error";
  
  public ServiceErrorResponse(int code, boolean b, String s)
  {
    serviceErrorCode = code;
    validationProblem = b;
    message = s;
  }

  public int getServiceErrorCode() 
  { 
    return serviceErrorCode; 
  }

  public boolean getValidationProblem() 
  { 
    return validationProblem; 
  }

  public String getMessage() 
  { 
    return message; 
  }

}