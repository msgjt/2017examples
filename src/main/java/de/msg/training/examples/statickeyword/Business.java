package de.msg.training.examples.statickeyword;

public class Business {

  public String doBusiness(final String parameter) {
    String cleanedParameter = cleanString(parameter);
    cleanedParameter = doSpecificBusiness(cleanedParameter);
    return parameter;
  }


  private String doSpecificBusiness(final String parameter) {
    return parameter;
  }


  public String cleanString(final String stringToClean) {
    String cleanedString = stringToClean.trim();
    return cleanedString.replaceAll("[\r\n]", "");
  }

}
