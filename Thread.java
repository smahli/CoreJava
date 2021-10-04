public class Thread implements Runnable {

    //constructors
    1.Thread()
    2.Thread(Runnable target)
    3.Thread(String name)
    4.Thread(Runnable target, String name)
    5.Thread(ThreadGroup tg,Runnable target)
    6.Thread(Thread group tg , String name)
    7.Thread(Thread group tg , Runnable target, String name)
    8.Thread(Thread group tg, Runnable target,String name, Long String Size )


        // methods

    run()
    currentThread()
        start()
            isalive()
                getName()
                    setName(String name)
                        setDaemon(boolean b)
                            isDaemon()
                                getPriority()
                                    setPriority(int p)

                                        sleep(time)
                                            yield()
                                                join()
                                                    suspend() // not in the java now
                                                        resume()
                                                            stop()
                                                                destroy() // not in the java by now

                                                                    interrpt()
                                                                        isInterrupted()
                                                                            interrupted()





}
