<?xml version="1.0" encoding="UTF-8"?>
<!--
  ! CCPL HEADER START
  !
  ! This work is licensed under the Creative Commons
  ! Attribution-NonCommercial-NoDerivs 3.0 Unported License.
  ! To view a copy of this license, visit
  ! http://creativecommons.org/licenses/by-nc-nd/3.0/
  ! or send a letter to Creative Commons, 444 Castro Street,
  ! Suite 900, Mountain View, California, 94041, USA.
  !
  ! You can also obtain a copy of the license at
  ! src/main/resources/legal-notices/CC-BY-NC-ND.txt.
  ! See the License for the specific language governing permissions
  ! and limitations under the License.
  !
  ! If applicable, add the following below this CCPL HEADER, with the fields
  ! enclosed by brackets "[]" replaced with your own identifying information:
  !      Portions Copyright [yyyy] [name of copyright owner]
  !
  ! CCPL HEADER END
  !
  !      Copyright 2011 ForgeRock AS
  !    
-->
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

  <xsl:import href="urn:docbkx:stylesheet"/>

  <xsl:param name="fop1.extensions" select="1" />
  <xsl:param name="shade.verbatim" select="1" />
  <xsl:attribute-set name="shade.verbatim.style">
    <xsl:attribute name="background-color">#fafafa</xsl:attribute>
    <xsl:attribute name="border-width">0.5pt</xsl:attribute>
    <xsl:attribute name="border-style">dashed</xsl:attribute>
    <xsl:attribute name="border-color">#000000</xsl:attribute>
    <xsl:attribute name="padding">3pt</xsl:attribute>
  </xsl:attribute-set>
  <xsl:param name="ulink.footnotes" select="1" />

</xsl:stylesheet>