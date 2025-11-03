package com.docusign.core.model.manifestModels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ManifestStructure {
    public SupportingTexts SupportingTexts;

    public List<APIs> APIs = new ArrayList<APIs>();
}
