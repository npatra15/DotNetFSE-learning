// See https://aka.ms/new-console-template for more information
using System;

namespace SingletonPattern
{
    public class Logger
    {
        private static Logger _instance;
        private static readonly object _lock = new object();

        private Logger()
        {
            Console.WriteLine("Logger instance created.");
        }

        public static Logger GetInstance()
        {
            if (_instance == null)
            {
                lock (_lock)
                {
                    if (_instance == null)
                        _instance = new Logger();
                }
            }
            return _instance;
        }

        public void Log(string message)
        {
            Console.WriteLine($"Log: {message}");
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Logger logger1 = Logger.GetInstance();
            logger1.Log("First log message.");

            Logger logger2 = Logger.GetInstance();
            logger2.Log("Second log message.");

            Console.WriteLine(Object.ReferenceEquals(logger1, logger2)
                ? "Only one instance exists. Singleton works!"
                : "Different instances. Singleton failed.");
        }
    }
}

