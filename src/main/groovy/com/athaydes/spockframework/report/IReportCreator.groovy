package com.athaydes.spockframework.report

import com.athaydes.spockframework.report.internal.SpecData

/**
 *
 * User: Renato
 */
public interface IReportCreator {

	void createReportFor( SpecData data )

	void setOutputDir( String path )

	void setHideEmptyBlocks( boolean hide )

}