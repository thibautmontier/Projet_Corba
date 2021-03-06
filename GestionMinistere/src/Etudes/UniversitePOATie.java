package Etudes;

/**
 * Interface definition : Universite
 * 
 * @author OpenORB Compiler
 */
public class UniversitePOATie extends UniversitePOA
{

    //
    // Private reference to implementation object
    //
    private UniversiteOperations _tie;

    //
    // Private reference to POA
    //
    private org.omg.PortableServer.POA _poa;

    /**
     * Constructor
     */
    public UniversitePOATie(UniversiteOperations tieObject)
    {
        _tie = tieObject;
    }

    /**
     * Constructor
     */
    public UniversitePOATie(UniversiteOperations tieObject, org.omg.PortableServer.POA poa)
    {
        _tie = tieObject;
        _poa = poa;
    }

    /**
     * Get the delegate
     */
    public UniversiteOperations _delegate()
    {
        return _tie;
    }

    /**
     * Set the delegate
     */
    public void _delegate(UniversiteOperations delegate_)
    {
        _tie = delegate_;
    }

    /**
     * _default_POA method
     */
    public org.omg.PortableServer.POA _default_POA()
    {
        if (_poa != null)
            return _poa;
        else
            return super._default_POA();
    }

    /**
     * Operation getEtudiants
     */
    public Etudes.Etudiant[] getEtudiants()
    {
        return _tie.getEtudiants();
    }

    /**
     * Operation demanderConnexion
     */
    public boolean demanderConnexion(String numEtudiant, String motDePasse)
    {
        return _tie.demanderConnexion( numEtudiant,  motDePasse);
    }

    /**
     * Operation demanderInscription
     */
    public boolean demanderInscription(String numEtudiant, String motDePasse)
    {
        return _tie.demanderInscription( numEtudiant,  motDePasse);
    }

    /**
     * Operation getPropositionByFormation
     */
    public Etudes.Proposition[] getPropositionByFormation(Etudes.Formation formation)
    {
        return _tie.getPropositionByFormation( formation);
    }

    /**
     * Operation getPrerequis
     */
    public Etudes.Licence[] getPrerequis(Etudes.Formation formation)
        throws Etudes.PropositionDoesNotExist
    {
        return _tie.getPrerequis( formation);
    }

    /**
     * Operation creerProposition
     */
    public void creerProposition(Etudes.Formation nouvelleFormation, Etudes.Licence[] prerequis)
    {
        _tie.creerProposition( nouvelleFormation,  prerequis);
    }

    /**
     * Operation majPrerequis
     */
    public void majPrerequis(Etudes.Formation formation, Etudes.Licence[] nouveauxPrerequis)
    {
        _tie.majPrerequis( formation,  nouveauxPrerequis);
    }

    /**
     * Operation getClassement
     */
    public short getClassement(Etudes.Etudiant sujet, Etudes.Licence formation)
        throws Etudes.pasDiplomeException
    {
        return _tie.getClassement( sujet,  formation);
    }

}
