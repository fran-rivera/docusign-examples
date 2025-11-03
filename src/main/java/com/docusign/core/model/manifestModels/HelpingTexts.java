package com.docusign.core.model.manifestModels;

import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class HelpingTexts {
    public String EmailWontBeShared;

    public String SaveAgentActivationCode;

    public String PhoneNumberWontBeShared;

    public String CCEmailShouldDifferFromSigner;

    public String AccessCodeText;

    public String CountryCodeText;

    public String ChooseDateInTheFuture;

    public String PhoneNumberWillBeNotified;

    public String EmailAddressOfUserToDelete;

    public String UserIDOfUserToDelete;

    public String DynamicContentValue;

    public String DynamicContentNote;

    public String EmbedClickwrapURL;

    public String NOTAGREED;

    public String AGREED;

    public String SubmitButtonDeleteText;

    public String SubmitButtonRestoreText;

    public String EnvelopeWillBeRestored;

    public String DefaultEnvelopeId;
}
