package br.com.ricas;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Path("/read")
public class K6Resources {

    Logger logger
            = Logger.getLogger(
            K6Resources.class.getName());

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{total}")
    public Map<Integer, String> read(@PathParam("total") int total) {
        logger.log(Level.INFO, "Reading data");

        return
                IntStream.range(0, total)
                        .boxed()
                        .collect(Collectors
                                .toMap(index -> index, index -> "Value about " + index, (a, b) -> b));
    }
}