package Etudes;

/** 
 * Helper class for : NombreMaxDeVoeuxAtteint
 *  
 * @author OpenORB Compiler
 */ 
public class NombreMaxDeVoeuxAtteintHelper
{
    private static final boolean HAS_OPENORB;
    static {
        boolean hasOpenORB = false;
        try {
            Thread.currentThread().getContextClassLoader().loadClass("org.openorb.CORBA.Any");
            hasOpenORB = true;
        }
        catch(ClassNotFoundException ex) {
        }
        HAS_OPENORB = hasOpenORB;
    }
    /**
     * Insert NombreMaxDeVoeuxAtteint into an any
     * @param a an any
     * @param t NombreMaxDeVoeuxAtteint value
     */
    public static void insert(org.omg.CORBA.Any a, Etudes.NombreMaxDeVoeuxAtteint t)
    {
        a.insert_Streamable(new Etudes.NombreMaxDeVoeuxAtteintHolder(t));
    }

    /**
     * Extract NombreMaxDeVoeuxAtteint from an any
     * @param a an any
     * @return the extracted NombreMaxDeVoeuxAtteint value
     */
    public static Etudes.NombreMaxDeVoeuxAtteint extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        if (HAS_OPENORB && a instanceof org.openorb.CORBA.Any) {
            // streamable extraction. The jdk stubs incorrectly define the Any stub
            org.openorb.CORBA.Any any = (org.openorb.CORBA.Any)a;
            try {
                org.omg.CORBA.portable.Streamable s = any.extract_Streamable();
                if(s instanceof Etudes.NombreMaxDeVoeuxAtteintHolder)
                    return ((Etudes.NombreMaxDeVoeuxAtteintHolder)s).value;
            } catch (org.omg.CORBA.BAD_INV_ORDER ex) {
            }
            Etudes.NombreMaxDeVoeuxAtteintHolder h = new Etudes.NombreMaxDeVoeuxAtteintHolder(read(a.create_input_stream()));
            a.insert_Streamable(h);
            return h.value;
        }
        return read(a.create_input_stream());
    }

    //
    // Internal TypeCode value
    //
    private static org.omg.CORBA.TypeCode _tc = null;
    private static boolean _working = false;

    /**
     * Return the NombreMaxDeVoeuxAtteint TypeCode
     * @return a TypeCode
     */
    public static org.omg.CORBA.TypeCode type()
    {
        if (_tc == null) {
            synchronized(org.omg.CORBA.TypeCode.class) {
                if (_tc != null)
                    return _tc;
                if (_working)
                    return org.omg.CORBA.ORB.init().create_recursive_tc(id());
                _working = true;
                org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
                org.omg.CORBA.StructMember []_members = new org.omg.CORBA.StructMember[0];

                _tc = orb.create_exception_tc(id(),"NombreMaxDeVoeuxAtteint",_members);
                _working = false;
            }
        }
        return _tc;
    }

    /**
     * Return the NombreMaxDeVoeuxAtteint IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:Etudes/NombreMaxDeVoeuxAtteint:1.0";

    /**
     * Read NombreMaxDeVoeuxAtteint from a marshalled stream
     * @param istream the input stream
     * @return the readed NombreMaxDeVoeuxAtteint value
     */
    public static Etudes.NombreMaxDeVoeuxAtteint read(org.omg.CORBA.portable.InputStream istream)
    {
        Etudes.NombreMaxDeVoeuxAtteint new_one = new Etudes.NombreMaxDeVoeuxAtteint();

        if (!istream.read_string().equals(id()))
         throw new org.omg.CORBA.MARSHAL();

        return new_one;
    }

    /**
     * Write NombreMaxDeVoeuxAtteint into a marshalled stream
     * @param ostream the output stream
     * @param value NombreMaxDeVoeuxAtteint value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, Etudes.NombreMaxDeVoeuxAtteint value)
    {
        ostream.write_string(id());
    }

}
