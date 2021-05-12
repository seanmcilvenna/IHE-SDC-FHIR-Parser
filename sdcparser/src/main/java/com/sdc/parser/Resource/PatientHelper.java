package com.sdc.parser.Resource;

import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Practitioner;

import ca.uhn.fhir.context.FhirContext;

public class PatientHelper {
	public static Patient createPatient(FhirContext ctx) {
		Patient patient = new Patient();
		patient.addIdentifier().setSystem("urn:system").setValue("8134838348");
		patient.addName().setFamily("Shepard").addGiven("Meredith");
		patient.setGender(org.hl7.fhir.r4.model.Enumerations.AdministrativeGender.FEMALE);
//		String encoded = ctx.newXmlParser().setPrettyPrint(true).encodeResourceToString(patient);
		return patient;
	}

	public static Practitioner createPractitioner(FhirContext ctx) {
		Practitioner pract = new Practitioner();
		pract.addName().setFamily("Karev").addGiven("Alex");
		pract.addIdentifier().setSystem("http://someIdentifier.com").setValue("pathpract1");
//		String encoded = ctx.newXmlParser().setPrettyPrint(true).encodeResourceToString(pract);
		return pract;
	}
}
