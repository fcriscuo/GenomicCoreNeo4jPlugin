package genomiccore;

import org.neo4j.procedure.Description;
import org.neo4j.procedure.Name;
import org.neo4j.procedure.UserFunction;

public class UrlFunctions {
    @UserFunction
    @Description("genomiccore.pubmedUrl('pubId') - resolve the PubMed URL")
    public String resolvePubmedUrl(
            @Name("pubId") String pubId) {
        String template = "https://pubmed.ncbi.nlm.nih.gov/XXXX/";
        return template.replace("XXXX", pubId);
    }

}
