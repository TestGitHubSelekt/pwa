// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package pwa.proxies;

public class Icon
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject iconMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "PWA.Icon";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Src("Src"),
		_type("_type"),
		Sizes("Sizes");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Icon(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "PWA.Icon"));
	}

	protected Icon(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject iconMendixObject)
	{
		if (iconMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("PWA.Icon", iconMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a PWA.Icon");

		this.iconMendixObject = iconMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Icon.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static pwa.proxies.Icon initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return pwa.proxies.Icon.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static pwa.proxies.Icon initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new pwa.proxies.Icon(context, mendixObject);
	}

	public static pwa.proxies.Icon load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return pwa.proxies.Icon.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Src
	 */
	public final java.lang.String getSrc()
	{
		return getSrc(getContext());
	}

	/**
	 * @param context
	 * @return value of Src
	 */
	public final java.lang.String getSrc(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Src.toString());
	}

	/**
	 * Set value of Src
	 * @param src
	 */
	public final void setSrc(java.lang.String src)
	{
		setSrc(getContext(), src);
	}

	/**
	 * Set value of Src
	 * @param context
	 * @param src
	 */
	public final void setSrc(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String src)
	{
		getMendixObject().setValue(context, MemberNames.Src.toString(), src);
	}

	/**
	 * @return value of _type
	 */
	public final java.lang.String get_type()
	{
		return get_type(getContext());
	}

	/**
	 * @param context
	 * @return value of _type
	 */
	public final java.lang.String get_type(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames._type.toString());
	}

	/**
	 * Set value of _type
	 * @param _type
	 */
	public final void set_type(java.lang.String _type)
	{
		set_type(getContext(), _type);
	}

	/**
	 * Set value of _type
	 * @param context
	 * @param _type
	 */
	public final void set_type(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String _type)
	{
		getMendixObject().setValue(context, MemberNames._type.toString(), _type);
	}

	/**
	 * @return value of Sizes
	 */
	public final java.lang.String getSizes()
	{
		return getSizes(getContext());
	}

	/**
	 * @param context
	 * @return value of Sizes
	 */
	public final java.lang.String getSizes(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Sizes.toString());
	}

	/**
	 * Set value of Sizes
	 * @param sizes
	 */
	public final void setSizes(java.lang.String sizes)
	{
		setSizes(getContext(), sizes);
	}

	/**
	 * Set value of Sizes
	 * @param context
	 * @param sizes
	 */
	public final void setSizes(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String sizes)
	{
		getMendixObject().setValue(context, MemberNames.Sizes.toString(), sizes);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return iconMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final pwa.proxies.Icon that = (pwa.proxies.Icon) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "PWA.Icon";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
