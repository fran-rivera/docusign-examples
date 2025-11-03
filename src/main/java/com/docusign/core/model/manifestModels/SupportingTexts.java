package com.docusign.core.model.manifestModels;

import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class SupportingTexts {
    public String HomePageText;

    public String ContactSupportToEnableFeature;

    public String ViewSourceFile;

    public String APIMethodUsed;

    public String APIMethodUsedPlural;

    public String SubmitButton;

    public String ContinueButton;

    public String HomeButton;

    public String LoginButton;

    public String LogoutButton;

    public String SearchFailed;

    public String ChangeAPITypeButton;

    public String WelcomeText;

    public String CFRError;

    public String IdenticalEmailsNotAllowedErrorMessage;

    public LoginPage LoginPage;

    public SelectAPIPage SelectAPIPage;

    public HelpingTexts HelpingTexts;
}
