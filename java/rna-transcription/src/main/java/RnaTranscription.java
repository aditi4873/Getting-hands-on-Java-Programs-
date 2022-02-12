class RnaTranscription {

    String transcribe(String dnaStrand) {
        char rna[]=dnaStrand.toCharArray();
        for(int i=0;i<rna.length;i++)
            {
                switch(rna[i])
                    {
                        case 'G':
                            rna[i]='C';
                            break;
                        case 'C':
                            rna[i]='G';
                            break;
                        case 'T':
                            rna[i]='A';
                            break;
                        case 'A':
                            rna[i]='U';
                            break;
                    }
            }
        String rnaTranscribe = new String(rna);
        return rnaTranscribe;
    }

}
