/*
 * NetworkEdge.java
 *
 * $Id: GeomPlanarGraphEdge.java,v 1.2 2010-08-20 18:28:03 mcoletti Exp $
 */

package sim.util.geo;

import com.vividsolutions.jts.geom.LineString;
import com.vividsolutions.jts.planargraph.Edge;

/** A planar graph edge that wraps a LineString
 *
 * XXX Should consider making this an internal class to GeomPlanarGraph?
 */
public class GeomPlanarGraphEdge extends Edge {

    private LineString line; // line that corresponds to this edge

    public GeomPlanarGraphEdge(LineString line)
    {
        this.line = line;
    }
  
    public LineString getLine() { return line; }
}