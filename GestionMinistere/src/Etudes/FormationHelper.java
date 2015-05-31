package Etudes;

/** 
 * Helper class for : Formation
 *  
 * @author OpenORB Compiler
 */ 
public class FormationHelper
{
    /**
     * Insert Formation into an any
     * @param a an any
     * @param t Formation value
     */
    public static void insert(org.omg.CORBA.Any a, Etudes.Formation t)
    {
        a.insert_Object(t , type());
    }

    /**
     * Extract Formation from an any
     * @param a an any
     * @return the extracted Formation value
     */
    public static Etudes.Formation extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        try {
            return Etudes.FormationHelper.narrow(a.extract_Object());
        } catch (final org.omg.CORBA.BAD_PARAM e) {
            throw new org.omg.CORBA.MARSHAL(e.getMessage());
        }
    }

    //
    // Internal TypeCode value
    //
    private static org.omg.CORBA.TypeCode _tc = null;

    /**
     * Return the Formation TypeCode
     * @return a TypeCode
     */
    public static org.omg.CORBA.TypeCode type()
    {
        if (_tc == null) {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            _tc = orb.create_interface_tc(id(),"Formation");
        }
        return _tc;
    }

    /**
     * Return the Formation IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:Etudes/Formation:1.0";

    /**
     * Read Formation from a marshalled stream
     * @param istream the input stream
     * @return the readed Formation value
     */
    public static Etudes.Formation read(org.omg.CORBA.portable.InputStream istream)
    {
        return(Etudes.Formation)istream.read_Object(Etudes._FormationStub.class);
    }

    /**
     * Write Formation into a marshalled stream
     * @param ostream the output stream
     * @param value Formation value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, Etudes.Formation value)
    {
        ostream.write_Object((org.omg.CORBA.portable.ObjectImpl)value);
    }

    /**
     * Narrow CORBA::Object to Formation
     * @param obj the CORBA Object
     * @return Formation Object
     */
    public static Formation narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof Formation)
            return (Formation)obj;

        if (obj._is_a(id()))
        {
            _FormationStub stub = new _FormationStub();
            stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
            return stub;
        }

        throw new org.omg.CORBA.BAD_PARAM();
    }

    /**
     * Unchecked Narrow CORBA::Object to Formation
     * @param obj the CORBA Object
     * @return Formation Object
     */
    public static Formation unchecked_narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof Formation)
            return (Formation)obj;

        _FormationStub stub = new _FormationStub();
        stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
        return stub;

    }

}